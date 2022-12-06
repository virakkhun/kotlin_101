import classes.Rectangle
import loops.printOutLoop
import loops.printWhileLoop
import loops.printWithIndex

fun main(args: Array<String>) {
    // @ variables with `val`
    // read-only variables which can be assigned only once
    // Un-annotate variable since it is inferred `Int`
    val sumOfNormalFunction = sum(10, 10)

    // Annotate type variable
    val sumOfSortFunction: Int = sumInfer(30, 20)

    // Variable without initializer has to be explicit type annot
    val requiredWhenNoInitializer: String
    // assign value to val above
    requiredWhenNoInitializer = "Hi"

    // @ variables with `var`
    // re-assignable
    var name: String = "Kotlin"
    var age: Int = 20

    // @ Class instances
    val rectangle = Rectangle(30.00, 300.20)

    // print with a new link break
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")

    println("==========================================")

    println(sumOfNormalFunction)
    println(sumOfSortFunction)
    println(requiredWhenNoInitializer)

    println("==========================================")

    // @ string templates
    // simple name in template
    println("My name is $name and I am $age years old!")

    println("==========================================")

    // arbitrary expression in template
    println("The perimeter is ${rectangle.perimeter}")

    println("===================FOR-LOOP=======================")
    printOutLoop()
    printWithIndex()

    println("===================WHILE-LOOP=======================")

    printWhileLoop()
}