package primitives;

/**
 * class material is about to define materials
 */
public class Material {
    /**
     * represents diffuse factor.
     */
    public double kD = 0d;
    /**
     * represents specular factor.
     */
    public double kS = 0d;
    /**
     * represents transparency factor
     */
    public double kT = 0d;

    /**
     * setter for kT
     * @param kT transparency
     * @return this
     */
    public Material setkT(double kT) {
        this.kT = kT;
        return this;
    }

    /**
     * setter for kR
     * @param kR reflectiveness
     * @return this
     */
    public Material setkR(double kR) {
        this.kR = kR;
        return this;
    }

    /**
     * reflectiveness
     */
    public double kR = 0d;
    /**
     * shininess
     */
    public int nShininess = 0;

    /**
     * setter of parameter kD
     * @param kD diffusion of the light
     * @return this
     */
    public Material setkD(double kD) {
        this.kD = kD;
        return this;
    }

    /**
     * setter of kS
     * @param kS specular of the light
     * @return this
     */
    public Material setkS(double kS) {
        this.kS = kS;
        return this;
    }

    /**
     * setter of shininess
     * @param nShininess the shininess of the material
     * @return this
     */
    public Material setnShininess(int nShininess) {
        this.nShininess = nShininess;
        return this;
    }
}
