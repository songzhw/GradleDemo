import ca.six.gproj1.lib1.Lib1
import ca.six.gproj1.lib2.Lib2

fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString(";")}")

    val lib1 = Lib1()
    lib1.hi()

    val lib2 = Lib2()
    lib2.hi()

}