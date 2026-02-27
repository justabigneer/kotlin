//Print messages
fun main() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}
//Fix compile error
println("hello this is a program}"
println("Hello this is a program")

//String templates
fun main() {
    val discountPercentage 
    val item = "Google Chromecast"
    discountPercentage=20
    val offer = "Sale  - Up to $discountPercentage% discount off $item! Hurry Up!"

    println(offer)
}

ans:
fun main() {
    val discountPercentage = 20
    val item = "Google Chromecast"
    val offer = "Sale  - Up to $discountPercentage% discount off $item! Hurry Up!"

    println(offer)
}

//Add two functions add and subtract
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

//11. Move duplicate code into a function
/*fun main() {
  *  println("City: Ankara")
   * println("Low temperature: 27, High temperature: 31")
   * println("Chance of rain: 82%")
   * println()

  *  println("City: Tokyo")
  *  println("Low temperature: 32, High temperature: 36")
  *  println("Chance of rain: 10%")
  *  println()
    
  *  println("City: Cape Town")
  *  println("Low temperature: 59, High temperature: 64")
  *  println("Chance of rain: 2%")
  *  println()
    
  *  println("City: Guatemala City")
 *   println("Low temperature: 50, High temperature: 55")
  *  println("Chance of rain: 7%")
 *   println()
*}
*/
//Answer

fun main() {
    println(weather("Ankara",27,31,82))
    println(weather("Tokyo",32,36,10))
    println(weather("Cape Town",59,64,2))
    println(weather("Guatemala City",50,55,7))
}
fun weather(city: String,ltemp: Int,htemp: Int,rain:Int):String
{
    return "City: $city\n Low Temperature: $ltemp, hightemp: $htemp\n Chance of rain :$rain% "
}
