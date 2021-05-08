interface treeBase{
    fun print()
}

class Leaf(val kolor: String): treeBase{
    override fun print() {
        println("Liść koloru ${kolor}")
    }

}

class Branch: treeBase{
    override fun print() {
    }
    fun addBranch(branch: Branch){

    }
    fun addLeaf(leaf: Leaf){

    }

}

class Tree {
    fun print(){
        println("Proste drzewko")
    }
}