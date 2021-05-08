interface treeBase{
    fun print(spaces: String="  ")
}

class Leaf(val kolor: String): treeBase{
    override fun print(spaces: String) {
        println(spaces+"Liść koloru ${kolor}")
    }

}

open class Branch: treeBase{
    val branchList:MutableList<treeBase> = mutableListOf()

    override fun print(spaces: String) {
        println("Gałąż: ")
        branchList.forEach{it.print(spaces+"  ")}
    }
    fun addBranch(branch: Branch){
        branchList.add(branch)
    }
    fun addLeaf(leaf: Leaf){
        branchList.add(leaf)
    }

}

class Tree : Branch(){
    override fun print(spaces: String){
        println("Proste drzewko")
        super.print("  ")
    }
}