package com.mesrop;

public class Name {
    protected String MaleOrFem;
    public void SetMaleOrFemale(String maleOrFem){
        if(maleOrFem == "жіночий" || maleOrFem == "чоловічий"){
            MaleOrFem = maleOrFem;
        }
        else{
            MaleOrFem = null;
        }
    }
    public String GetMaleOrFemale(){
        return MaleOrFem;
    }
    protected String Name;
    public Name(String maleOrFemale, String name)
    {
        SetMaleOrFemale(maleOrFemale);
        Name = name;
    }
    public Name(){}
}
