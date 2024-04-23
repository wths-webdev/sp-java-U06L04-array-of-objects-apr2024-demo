public class SantaList{
    private Kid[] children; // an array of Kids!
    private boolean readTheList;
    private boolean checkedItTwice;

    public SantaList(){
        children = new Kid[5]; // assigned null by default
        for(int i = 0; i < children.length; i++){
            children[i] = new Kid(); // create Kid objects with default constructor
        }
        readTheList = false;
        checkedItTwice = false;
    }

    public SantaList(Kid[] k, boolean r, boolean c){
        children = k;
        readTheList = r;
        checkedItTwice = c;
    }
    public Kid[] getChildren(){
        return children;
    }
    public void changeChild(int index, boolean b){
        children[index].setNice(b);
        // children is an array of Kid objects, so we can use a Kid method on it!
    }
    public void toggleNiceOrNaughty(int index){
        // check list of kid at index
        // toggle their nice with !
        boolean nice = children[index].getNice();

//      children[index].setNice(!nice);

        changeChild(index, !nice);
    }
    public boolean getReadTheList(){
        return readTheList;
    }
    public boolean getCheckedItTwice(){
        return checkedItTwice;
    }
    public void setReadTheList(boolean b){
        readTheList = b;
    }
    public void setCheckedItTwice(boolean c){
        checkedItTwice = c;
    }
}
