package io.github.gokulsiva.hackernews;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TopStories.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class TopStories extends Fragment {

    private OnFragmentInteractionListener mListener;

    public TopStories() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_top_stories, container, false);

        //Refer
        //https://stackoverflow.com/questions/11421368/android-fragment-oncreateview-with-gestures?rq=1
        //https://stackoverflow.com/questions/22011715/onfling-is-not-called-on-the-last-listview-item
//        final GestureDetector gestureDetector = new GestureDetector(getActivity(), new GestureDetector.SimpleOnGestureListener(){
//            @Override
//            public boolean onDown(MotionEvent e) {
//                return true;
//            }
//
//            @Override
//            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
//                Log.i("HK", "onFling has been called!");
//                final int SWIPE_MIN_DISTANCE = 120;
//                final int SWIPE_MAX_OFF_PATH = 250;
//                final int SWIPE_THRESHOLD_VELOCITY = 200;
//                try {
//                    if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH)
//                        return false;
//                    if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE
//                            && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
//                        Log.i("HK", "Right to Left");
//                    } else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE
//                            && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
//                        Log.i("HK", "Left to Right");
//                    }
//                } catch (Exception e) {
//                    // nothing
//                }
//                return super.onFling(e1, e2, velocityX, velocityY);
//            }
//        });
//
//        view.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                return gestureDetector.onTouchEvent(event);
//            }
//        });

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
