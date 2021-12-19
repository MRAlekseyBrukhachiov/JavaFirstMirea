package ru.mirea.task32.animations;

import javafx.animation.ScaleTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class ScaleMore {

    private ScaleTransition st;

    public ScaleMore(Node node) {
        st = new ScaleTransition(Duration.millis(100), node);
        st.setFromX(0.55);
        st.setFromY(0.55);
        st.setByX(0.6);
        st.setByY(0.6);
        //st.setAutoReverse(true);
    }

    public void playAnim() {
        st.playFromStart();
    }
}
