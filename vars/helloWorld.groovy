//def call(Map config = [:]) {
//    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
//}
//def call() {
//    powershell ' Write-Host "Hello" '
//}
def call(String name) {
    powershell ' dir env: '
    powershell """
    
    echo "$name"
    \$var = "$name"
    echo $var
    
    """
    //sh ' echo Hello ${name} '
}
