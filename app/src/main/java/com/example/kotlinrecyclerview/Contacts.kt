package com.example.kotlinrecyclerview

data class Contacts(val name:String, val age:Int) {
   val imageURL = "https://picsum.photos/150?random=$age"
}