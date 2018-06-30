package codingchallenge.marsrover.mars;

/**
 * Created by Govind on 29/06/2018
 */
public enum Direction {

    N(0,1){
        @Override
        public Direction right() {
            return W;
        }

        @Override
        public Direction left() {
            return E;
        }
    },
    S(0,-1){
        @Override
        public Direction right() {
            return W;
        }

        @Override
        public Direction left() {
            return E;
        }

    },
    E(1,0){
        @Override
        public Direction right() {
            return S;
        }

        @Override
        public Direction left() {
            return N;
        }
    },
    W(-1,0){
        @Override
        public Direction right() {
            return N;
        }

        @Override
        public Direction left() {
            return S;
        }
    };

    private final int stepSizeOnXAxis;
    private final int stepSizeOnYAxis;

    Direction(int stepSizeOnXAxis, int getStepSizeOnYAxis) {
        this.stepSizeOnXAxis = stepSizeOnXAxis;
        this.stepSizeOnYAxis = getStepSizeOnYAxis;
    }

    public abstract Direction right();
    public abstract Direction left();

    public int stepSizeForXAxis() {
        return this.stepSizeOnXAxis;
    }

    public int stepSizeForYAxis() {
        return this.stepSizeOnYAxis;
    }
}
