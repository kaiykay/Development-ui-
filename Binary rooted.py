class Node:
    def __init__(self, key):
        self.left = None  # Pointer to left child
        self.right = None  # Pointer to right child
        self.value = key  # Value of the node

class BinaryTree:
    def __init__(self):
        self.root = None  # Root of the binary tree

    def insert(self, key):
        if self.root is None:
            self.root = Node(key)  # If tree is empty, create root
        else:
            self._insert_recursively(self.root, key)

    def _insert_recursively(self, current_node, key):
        # Insert a new node in the tree
        if key < current_node.value:
            if current_node.left is None:
                current_node.left = Node(key)
            else:
                self._insert_recursively(current_node.left, key)
        else:
            if current_node.right is None:
                current_node.right = Node(key)
            else:
                self._insert_recursively(current_node.right, key)

    def inorder_traversal(self):
        # Perform in-order traversal
        return self._inorder_helper(self.root)

    def _inorder_helper(self, node):
        if node is None:
            return []
        return (self._inorder_helper(node.left) + 
                [node.value] + 
                self._inorder_helper(node.right))

# Example usage
if __name__ == "__main__":
    btree = BinaryTree()
    btree.insert(5)
    btree.insert(3)
    btree.insert(7)
    btree.insert(2)
    btree.insert(4)
    
    print("In-order traversal of the binary tree:")
    print(btree.inorder_traversal())
