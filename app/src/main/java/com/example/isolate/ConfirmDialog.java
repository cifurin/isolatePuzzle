package com.example.isolate;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class ConfirmDialog extends DialogFragment {
	@Override
	public AlertDialog onCreateDialog(Bundle savedInstanceState) {
		// Use the Builder class for convenient dialog construction
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setMessage("Congratulation !! Click Yes for another game?")
				.setPositiveButton("Yes.",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								GameActivity.game.newGame(Integer.parseInt(GameActivity.level.toString()));
								GameActivity.gameView.invalidate();
							}
						})
				.setNegativeButton("No.",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								getActivity().finish();
							}
						});
		// Create the AlertDialog object and return it
		return builder.create();
	}
}