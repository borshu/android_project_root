package borshu.modernart;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MoreInfoDialog extends DialogFragment {
	
	@SuppressLint("InflateParams")
	@Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
		
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        
        View view = (LinearLayout) getActivity().getLayoutInflater().inflate(R.layout.more_info_fragment, null);
        
        builder.setView(view);
        
        builder.setCancelable(true);
        
        final AlertDialog dialog = builder.create(); 
        
        return dialog;
    }

}
