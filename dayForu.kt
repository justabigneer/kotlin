fun sayHello(greeting:String,vararg itemsto:String) //vararg allows us to pass array of variables for one parameter without the need to call again and again
{
    itemsto.forEach{itemto->
    println("$greeting $itemto")}
}
fun greetPerson(greeting: String="Hello",name: String="Roxo")=p
fun main() {
	val intrests=arrayOf("Ram","Hari","Rita")
    sayHello(greeting="Hi",*intrests)
    greetPerson(name="Jhoe")
    greetPerson()
    
}