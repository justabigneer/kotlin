fun main() {
   birthday()

}
fun birthday(): Unit
{
    println("happy birthdayy!!")
    
}
//string
fun main() {
  val greetings= birthday()
  println(greetings)

}
fun birthday(): String
{
    val name="Happy Birthday"
    val greet="Person"
    
    return "$name\n$greet"
    
}
//with parameter
fun main() {
  val greetings= birthday("Ram",70)
  println(greetings)
    //or
     println(birthday("Ram",20))
}
fun birthday(name: String),age: Int: String
{
    val name="Happy Birthdayyy $name"
    val age="You are $age years old"
    return "$name\n$age"
    
}
//default argument
fun main() {
 println(birthday(age=20))

}
fun birthday(name: String="Rita", age: Int): String
{
    val name="Happy Birthdayyy $name"
    val age="You are $age years old"
    return "$name\n$age"
    
}