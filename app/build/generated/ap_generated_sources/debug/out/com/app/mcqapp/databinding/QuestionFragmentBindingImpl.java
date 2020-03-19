package com.app.mcqapp.databinding;
import com.app.mcqapp.R;
import com.app.mcqapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class QuestionFragmentBindingImpl extends QuestionFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView, 6);
        sViewsWithIds.put(R.id.radioGroup, 7);
        sViewsWithIds.put(R.id.button, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public QuestionFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private QuestionFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[8]
            , (android.widget.RadioGroup) bindings[7]
            , (android.widget.RadioButton) bindings[2]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.RadioButton) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rb1.setTag(null);
        this.rb2.setTag(null);
        this.rb3.setTag(null);
        this.rb4.setTag(null);
        this.textView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.model == variableId) {
            setModel((com.app.mcqapp.Question) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.app.mcqapp.Question Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.app.mcqapp.Question model = mModel;
        java.lang.Integer modelAnswersGetInt0AnswerId = null;
        com.app.mcqapp.Answer modelAnswersGetInt3 = null;
        java.lang.String modelAnswersGetInt1Answer = null;
        java.lang.String modelAnswersGetInt2Answer = null;
        java.lang.Integer modelAnswersGetInt1AnswerId = null;
        com.app.mcqapp.Answer modelAnswersGetInt2 = null;
        java.lang.String modelAnswersGetInt3Answer = null;
        java.lang.String modelQuestion = null;
        com.app.mcqapp.Answer modelAnswersGetInt0 = null;
        java.lang.Integer modelAnswersGetInt3AnswerId = null;
        com.app.mcqapp.Answer modelAnswersGetInt1 = null;
        java.lang.Integer modelAnswersGetInt2AnswerId = null;
        java.lang.String modelAnswersGetInt0Answer = null;
        java.util.List<com.app.mcqapp.Answer> modelAnswers = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.question
                    modelQuestion = model.getQuestion();
                    // read model.answers
                    modelAnswers = model.getAnswers();
                }


                if (modelAnswers != null) {
                    // read model.answers.get(3)
                    modelAnswersGetInt3 = modelAnswers.get(3);
                    // read model.answers.get(2)
                    modelAnswersGetInt2 = modelAnswers.get(2);
                    // read model.answers.get(0)
                    modelAnswersGetInt0 = modelAnswers.get(0);
                    // read model.answers.get(1)
                    modelAnswersGetInt1 = modelAnswers.get(1);
                }


                if (modelAnswersGetInt3 != null) {
                    // read model.answers.get(3).answer
                    modelAnswersGetInt3Answer = modelAnswersGetInt3.getAnswer();
                    // read model.answers.get(3).answerId
                    modelAnswersGetInt3AnswerId = modelAnswersGetInt3.getAnswerId();
                }
                if (modelAnswersGetInt2 != null) {
                    // read model.answers.get(2).answer
                    modelAnswersGetInt2Answer = modelAnswersGetInt2.getAnswer();
                    // read model.answers.get(2).answerId
                    modelAnswersGetInt2AnswerId = modelAnswersGetInt2.getAnswerId();
                }
                if (modelAnswersGetInt0 != null) {
                    // read model.answers.get(0).answerId
                    modelAnswersGetInt0AnswerId = modelAnswersGetInt0.getAnswerId();
                    // read model.answers.get(0).answer
                    modelAnswersGetInt0Answer = modelAnswersGetInt0.getAnswer();
                }
                if (modelAnswersGetInt1 != null) {
                    // read model.answers.get(1).answer
                    modelAnswersGetInt1Answer = modelAnswersGetInt1.getAnswer();
                    // read model.answers.get(1).answerId
                    modelAnswersGetInt1AnswerId = modelAnswersGetInt1.getAnswerId();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.rb1.setTag(modelAnswersGetInt0AnswerId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rb1, modelAnswersGetInt0Answer);
            this.rb2.setTag(modelAnswersGetInt1AnswerId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rb2, modelAnswersGetInt1Answer);
            this.rb3.setTag(modelAnswersGetInt2AnswerId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rb3, modelAnswersGetInt2Answer);
            this.rb4.setTag(modelAnswersGetInt3AnswerId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rb4, modelAnswersGetInt3Answer);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView2, modelQuestion);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}