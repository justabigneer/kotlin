fun main()
{
      // val name:String=null //not possible
    val name:String?=null //will work
    println(name)
    
}
//revise
fun sayHello(itemToGreet: String) = println("Hello to $itemToGreet")

fun main() {
    sayHello(itemToGreet = "heyy")
    val interst=arrayOf("one","teo","three")
    println(interst.size)
    println(interst[0])
    
    interst.forEach {it:String ->
    	println(it)}
    interst.forEachIndexed {index,interstt ->
    	println("$interstt in $index")}    
    val intersts=listOf("one","teo","three")
    val map=mapOf(1 to "a",2 to "b",3 to "c")
    
    map.forEach {key,value -> println("$key -> $value")}    
    //The above llist and maps cannot be edited after the declaration .i.e. values cannot be addded or removed to replace it we can use mutable ones
     val intersts=mutableOf("one","teo","three")//this one can be manipulatd
    intersts.add("four")
    val map=mutablemapOf(1 to "a",2 to "b",3 to "c")
    
    map.forEach {key,value -> println("$key -> $value")}
}
fun sayHello(itemsToGreet: List<String>,greeting:String)
{
    itemsToGreet.forEach {itemToGreet -> 
        println("$greeting to $itemToGreet")}
}

fun main() {
    val intersts=listOf("one","teo","three")
	sayHello(greeting="Hi",itemsToGreet=intersts)
  
    
}
