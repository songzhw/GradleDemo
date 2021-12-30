fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString(";")}")

    val lib1 = Lib1()
    lib1.hi()
}