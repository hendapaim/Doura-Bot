
fun main(args: Array<String>) {
    // greeting of bot
    println("Hello! My name is ${ConfigBot.nameBot}")
    println("I was Created in ${ConfigBot.createdIn}")

    // greeting of human
    if (ConfigBot.satusConfig) {
        println("How can you help, ${ConfigBot.userName}?")
        ConfigBot.inputBot()
    } else {
        println("Please, remind me your name.")
        ConfigBot.userName = ConfigBot.inputBot()
        println("What a great name you have, ${ConfigBot.userName}!")
        ConfigBot.satusConfig = true;
    }
}