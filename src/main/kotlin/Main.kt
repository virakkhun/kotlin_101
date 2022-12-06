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

    // print with a new link break
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")

    println("==========================================")

    println(sumOfNormalFunction)
    println(sumOfSortFunction)
    println(requiredWhenNoInitializer)

    println("==========================================")

    println("My name is $name and I am $age years old!")
}