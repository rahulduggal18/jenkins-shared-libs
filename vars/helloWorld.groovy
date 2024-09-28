//def call(Map config = [:]) {
//    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
//}
//def call() {
//    powershell ' Write-Host "Hello" '
//}
def call(String name) {
    println(name)
    powershell ' Write-Host "Hello ${env:name}" '
    //sh ' echo Hello ${name} '
}
