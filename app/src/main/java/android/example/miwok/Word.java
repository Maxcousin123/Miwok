package android.example.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwoktranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwoktranslation;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }



}
