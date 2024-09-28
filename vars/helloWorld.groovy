//def call(Map config = [:]) {
//    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
//}
//def call() {
//    powershell ' Write-Host "Hello" '
//}
def me(String name) {
   // powershell ' dir env: '
    powershell """
    
    Write-Host  Hello  "$name"
    
    """
    //sh ' echo Hello ${name} '
}
