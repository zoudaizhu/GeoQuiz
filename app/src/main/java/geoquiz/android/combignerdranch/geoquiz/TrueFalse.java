package geoquiz.android.combignerdranch.geoquiz;

/**
 * Created by zoudaizhu on 2017/8/12.
 */

public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }

    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }
}
