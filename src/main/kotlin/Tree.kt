interface treeBase{
    fun print()
}

class Leaf(val kolor: String): treeBase{
    override fun print() {
        println("Liść koloru ${kolor}")
    }

}

open class Branch: treeBase{
    val branchList:MutableList<treeBase> = mutableListOf()

    override fun print() {
        println("Gałąż ...")
        branchList.forEach{it.print()}
    }
    fun addBranch(branch: Branch){

    }
    fun addLeaf(leaf: Leaf){

    }

}

class Tree : Branch(){
    override fun print(){
        println("Proste drzewko")
    }
}