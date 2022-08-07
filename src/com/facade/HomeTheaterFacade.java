package com.facade;

/**
 * @author 86176
 */
public class HomeTheaterFacade {

    private Light light;
    private Popcorn popcorn;
    private Screen screen;
    private Stereo stereo;
    private DVDPlay dvdPlay;
    private Projector projector;

    public HomeTheaterFacade() {
        super();
        this.light = Light.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.dvdPlay = DVDPlay.getInstance();
        this.projector = Projector.getInstance();
    }

    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlay.on();
        light.dim();
    }

    public void play() {
        dvdPlay.play();
    }

    public void stop() {
        dvdPlay.pause();
    }

    public void end() {
        popcorn.off();
        light.bright();
        stereo.up();
    }

}
