//def call(Map config = [:]) {
//    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
//}
//def call() {
//    powershell ' Write-Host "Hello" '
//}
def call(Map config = [:]) {
   // powershell ' dir env: '
    powershell """
    
    Write-Host  Hello  "${config.name}"
    
    """
    //sh ' echo Hello ${name} '
}
