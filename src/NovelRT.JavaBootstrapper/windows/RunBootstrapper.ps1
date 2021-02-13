param(
  [string]$JavaLocation,
  [string]$BootstrapperPath = (Join-Path $PSScriptRoot "\JavaBootstrapper.exe"),

  [Parameter(Mandatory=$true, Position=0, ValueFromRemainingArguments=$true)]
  [string[]]$BootstrapperArguments
)
function Get-JavaLocation([string[]] $Folders)
{
  foreach ($folder in $Folders)
  {
    if ($folder -and
      (Test-Path (Join-Path $folder "java.dll")) -and
      (Test-Path (Join-Path $folder "server" | Join-Path -ChildPath "jvm.dll")))
    {
      return $folder
    }
  }
  return $null
}

if (!$JavaLocation)
{
  $foldersToSearch = @($PWD) + ($env:Path -split ';')
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
