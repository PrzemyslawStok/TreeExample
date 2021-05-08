fun main() {
    val tree = Tree()
    val branch0 = Branch()

    for(i in 1..5)
        branch0.addLeaf(Leaf("Zielony"))

    val branch1 = Branch()

    for(i in 1..7)
        branch0.addLeaf(Leaf("Zielony 1"))

    tree.addBranch(branch0)
    tree.addBranch(branch1)
    tree.print()
}