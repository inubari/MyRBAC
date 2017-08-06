package rbac.sunprakon.kittisak.myrbac.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import rbac.sunprakon.kittisak.myrbac.R;
import rbac.sunprakon.kittisak.myrbac.manager.MyAlert;

/**
 * Created by Administrator on 6/8/2560.
 */
public class SignUpFragment extends Fragment {

    private String nameString, userString, passwordString;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signup, container, false);
        return view;
    } //onCreateView

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Back Controller
        backController();

        //save controller
        saveController();

    }

    private void saveController() {
        ImageView imageView = (ImageView) getView().findViewById(R.id.imvSave);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Get Value From EditText
                EditText nameEditText = (EditText) getView().findViewById(R.id.edtName);
                EditText userEditText = (EditText) getView().findViewById(R.id.edtUser);
                EditText passwordEditText = (EditText) getView().findViewById(R.id.edtPassword);

                nameString = nameEditText.getText().toString().trim();
                userString = userEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();
                MyAlert myAlert = new MyAlert(getActivity());

                //Check Space
                if (nameString.equals("") || userString.equals("") || passwordString.equals("")) {
                    //Have Space
                    Log.d("6AugV1", "Have Space");
                    myAlert.myDialog("Have Space", "Please Fill All Every Blank");

                } else {
                    //No Space
                    Log.d("6AugV1", "No Space");

                }


            } //OnClick
        });
    }

    private void backController() {
        ImageView imageView = (ImageView) getView().findViewById(R.id.imvBack);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}  //Main Class
