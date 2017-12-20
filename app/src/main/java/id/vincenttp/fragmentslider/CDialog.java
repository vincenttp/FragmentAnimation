package id.vincenttp.fragmentslider;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;

/**
 * Created by vincent.parinding on 20/12/2017.
 */

public class CDialog extends Dialog{
    public CDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_slide);
        getWindow().getAttributes().windowAnimations = R.style.DialogTheme;
    }
}
