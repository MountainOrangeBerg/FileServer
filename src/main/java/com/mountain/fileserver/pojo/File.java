package com.mountain.fileserver.pojo;

public class File {
    private String name;
    private int size;
    private User owner;
    private boolean isPublic;
    
    public File(String name, int size, User owner, boolean isPublic) {
        this.name = name;
        this.size = size;
        this.owner = owner;
        this.isPublic = isPublic;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSize() {
        return size;
    }
    
    public User getOwner() {
        return owner;
    }
    
    public boolean isPublic() {
        return isPublic;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public void setOwner(User owner) {
        this.owner = owner;
    }
    
    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }
    
    // Other methods such as read(), write(), delete() etc.
}
