param(
  [string]$JavaLocation,
  [string]$BootstrapperPath = (Join-Path $PSScriptRoot "\JavaBootstrapper.exe"),

  [Parameter(Mandatory = $true, Position = 0, ValueFromRemainingArguments = $true)]
  [string[]]$BootstrapperArguments
)
function Get-JavaLocation([string[]] $Folders)
{
  function Get-ValidFolder([string[]] $FolderCandidates)
  {
    foreach ($folderCandidate in $FolderCandidates)
    {
      if ($folderCandidate -and
        (Test-Path (Join-Path $folderCandidate "java.dll")) -and
        (Test-Path (Join-Path $folderCandidate "server" | Join-Path -ChildPath "jvm.dll")))
      {
        return $folderCandidate
      }
    }

    return $null
  }

  foreach ($folder in $Folders)
  {
    if (!$folder) {
      continue
    }

    $valid = Get-ValidFolder -FolderCandidates ($folder,
    (Join-Path $folder "bin"),
    (Join-Path $folder "java-image" | Join-Path -ChildPath "bin"))

    if ($null -ne $valid) {
      return $valid
    }
  }
  return $null
}

if (!$JavaLocation)
{
  $foldersToSearch = @($PSScriptRoot) + ($env:Path -split ';')
  $JavaLocation = Get-JavaLocation($foldersToSearch)
}

if ($JavaLocation)
{
  $javaServerLocation = Join-Path $JavaLocation "server"
  $env:Path = $javaServerLocation + ";" + $JavaLocation + ";" + $env:Path
}
else
{
  Write-Error "No Java installation found."
}
&$BootstrapperPath $BootstrapperArguments
