package ru.mirea.task32.animations;

import javafx.animation.ScaleTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class ScaleLess {

    private ScaleTransition st;

    public ScaleLess(Node node) {
        st = new ScaleTransition(Duration.millis(100), node);
        st.setFromX(0.6);
        st.setFromY(0.6);
        st.setByX(0.55);
        st.setByY(0.55);
        //st.setAutoReverse(true);
    }

    public void playAnim() {
        st.playFromStart();
    }
}
