package CollectionChallenges

import java.util.*

class C39SortStringLenght {
    //Extend collections with a function that returns an array of strings sorted by their lengths,
    //longest first.
    //• The code ["a", "abc", "ab"].challenge39() should return ["abc",
    //"ab", "a"].
    //• The code ["paul", "taylor", "adele"].challenge39() should return
    //["taylor", "adele", "paul"].
    //• The code [String]().challenge39() should return [].

    fun test(){
        val collection: Collection<String> = listOf("a","abc","ab","abcd")
        println(collection.sortLenA())
    }

    fun Collection<String>.sortLen(): MutableList<String>{
        //my first aproach is to know the lengh for every string in the array
        val aux = mutableListOf<Int>()
        val result = mutableListOf<String>()
        //so i created a auxliar list to store all word lengths
        for (i in this){
            aux.add(i.length)
        }
        //then sort them in desending to the first one be the longest
        aux.sortDescending()
        //now search for the corresponding lengh in every word
        //this loop iterates in the lenght values
        for (i in aux){
            //this loop iterates on the items of collection
            for(j in this){
                //this if will identify if the lengh is the same value
                if (j.length == i){
                    //and add it if is the same
                    result.add(j)
                }
            }
        }
        // this operations will sort the items by its lengh by comparating every lenght with every element
        //not the best solution
        return result
    }

    fun Collection<String>.sortLenA(): SortedMap<Int, String> {
        val aux = mutableMapOf<Int,String>()
        val res = mutableListOf<String>()
        for (i in this){
            aux.put(i.length, i)
        }
        return aux.toSortedMap()
    }


    fun List<String>.challenge39(): List<String> {
        // here is the answer in the book adapted to kotlin
        //to do this it need to be a list of elements and use the sortedbydeceing
        return this.sortedByDescending { it.length }
    }

}