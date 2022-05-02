package chapters.chapter9.AbstractClassChallenge;

public class SearchTree implements NodeList{

    ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            this.root = newItem;
            return true;
        }
        //otherwise start comparing from the head of the tree
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparision = currentItem.compareTo(newItem);
            if(comparision < 0){
                // New Item is great , move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    // there is no next , so nsert at end of list
                    currentItem.setNext(newItem);
                    return true;

                }
            }else if(comparision > 0){
                //New Item is less
                if(currentItem.previous() != null){
                    currentItem = currentItem.previous();
                    return true;
                }else{
                    //The node with a previous is the root
                    currentItem.setPrevious(newItem);
                    return true;
                }
            }else{
                //equal
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("Deleting Item" + item.getValue());

        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;
        while(currentItem != null){
            int comparision = currentItem.compareTo(item);
            if(comparision < 0){
                parentItem = currentItem;
                currentItem = currentItem.next();
            }else if(comparision > 0){
               parentItem = currentItem;
               currentItem = currentItem.previous();
                }else{
                //We found the item so remove it
                  performRemoval(currentItem,parentItem);
                  return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item,ListItem parent){
        //remove from the tree
        if(item.next() == null){
            //no right tree so make parent point to the left tree (which may be null).
            if(parent.next() == item){
                //item is right child of its parent
                parent.setNext(item.previous());
            }else if(parent.previous() == item){
                //item is the left child of the parent
                parent.setPrevious(item.previous());

            }else{
                //parent must be item which means we are looking at the root of the tree;
                this.root = item.previous();
            }
        }else if (item.previous() == null){
            //no left tree , so make parent point to the right tree which may be null
           if(parent.next() == item){
               parent.setNext(item.next());
           }else if(parent.previous() == item){
               parent.setPrevious(item.next());
           }else{
               //again we are deleting the root
               this.root = item.next();
           }
        }else{
            //Neither left nor right are null deletion is not a lot tricker
            //from right sub tree find smallest value (i.e. the left most

            ListItem current = item.next();
            ListItem leftMostParent = item;
            while(current.previous() != null){
                leftMostParent = current;
                current = current.previous();
            }
            //Now put the smallest value into our node to be deleted.
            item.setValue(current.getValue());
            //and delete the smallest
            if(leftMostParent == item){
                //There  was no left most node, so 'current' points to the smallest node.
                //(the one that must now be deleted)
                item.setNext(current.next());
            }else{
                //Set the smallest nodes parent  to point  to
                //the smallest nodes right child (which may be null)
                leftMostParent.setPrevious(current.next());
            }
        }

    }

    @Override
    public void traverse(ListItem root) {
     //recursive method
        if(root != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
