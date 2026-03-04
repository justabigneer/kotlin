//Primary constructor for a class
class Person(val firstName: String,val  lastName: String)
{
   // val firstName=firstName
    //val lastName=lastName
    /*Or
    *init{
    *firstName=firstName
    *lastName=lastName
    *}
     */

}


//class Person if just used like this then it acts as the primary constructor for that class
//the main function
fun main() {
    val intrests=listOf("Kotlin","Java","Scala")
    val person=Person("Jon","Doe")
    person.firstName
    person.lastName

}
//Secondary
class Person(val firstName: String,val  lastName: String)
{
    init {
        println("init 1")
    }
    constructor():this("John","Doe")
    {
        println("My name is $firstName")
    }
    init {
        println("init 2")
    }
}
//initially init1 is called then init2 and thenn only the primary constrructor
//main function for Secondary
fun main() {
    val person=Person()
    person.firstName
    person.lastName

}
//using defalut ones

class Person(val firstName: String="Jone",val  lastName: String="jhh")
{
    var nickName: String?=null //mutable and it will have getter and setters by default
        //overwriting getter and setter
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("The returned value is $field")
            return field
        }
}
//main function
fun main() {
      val person=Person()   
       person.firstName
     person.lastName
    person.nickName="horr"
   person.nickName="hoho"
   println(person.nickName)
}
//using function
class Person(val firstName: String="Jone",val  lastName: String="jhh")
{
        //adding method
    //fun printInfo()
    //{
    //    println("$firstName is $lastName with $nickName")
    //}
    //Or
      fun printInfo()
    {
        //val nicknameToUse=if(nickName !=null) nickName else "no Nickname"
        val nickNameTO=nickName?: " no Nickname" //elvisoperator
        println("$firstName is $lastName with $nickName")
    }
}    
//main function
fin main()
{
    val person=Person()
    persom.printInfo()
}