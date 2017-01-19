class TreeNode(Object):
    def __init__(self,x):
        self.val = x
        self.left = None
        self.right = None

    def deleteNode(self,root,key):
        if root == null:
            return null
        
        if root.val < key:
            return deleteNode(root.right, key)
        elif root.val > key:
            return deleteNode(root.left, key)
        else:
            root.val = null
        
        if(root.left == null):
            root = root.right
        elif(root.right == null):
            root = root.left
        
        if(root.left != null and root.right != null):
            root = findMin(root.right)
            root.right = deleteNode(root.right, root.val)

        return root
            
    def findMin(self, node):
        while(root.left != null):
            root = root.left

        return root
         