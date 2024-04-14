package com.SKIPPS.utils.files;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.Toast;


public class HTTPUploadTask extends AsyncTask<String, Void, Void> {

    private final Context mContext;
    private final EditText mEditText;
    private Exception mException;
    String command;
    private boolean mIsSuccess = true;

    public HTTPUploadTask(Context context, EditText editText) {
        mContext = context;
        mEditText = editText;
    }

    @Override
    protected Void doInBackground(String... params) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
            mException = e;
            mIsSuccess = false;
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        if (mIsSuccess) {
            Toast.makeText(mContext, "File uploaded successfully", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(mContext, "Failed: " + mException.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
