from pygame.key import name
from Paddle import Paddle
from ball import Ball
from collections import namedtuple
import random
import pygame

def main():
    pygame.init()

    WIDTH = 800
    HEIGHT = 480
    screen = pygame.display.set_mode((WIDTH,HEIGHT))
    pygame.display.update()

    wcolor = pygame.Color("white")
    bgcolor = pygame.Color("black")
    BORDER = 20
    VELOCITY = 5
    FPS = 60 # framerate
 
    MyConstants = namedtuple("MyConstants", ["WIDTH", "HEIGHT", "BORDER", "VELOCITY", "FPS"])
    CONSTS = MyConstants(WIDTH, HEIGHT, BORDER, VELOCITY, FPS)
    pygame.draw.rect(screen, wcolor, pygame.Rect((0,0),(WIDTH, BORDER)))
    pygame.draw.rect(screen, wcolor, pygame.Rect((0,0),(BORDER, HEIGHT)))
    pygame.draw.rect(screen, wcolor, pygame.Rect((0,HEIGHT-BORDER),(WIDTH, BORDER)))

    x0 = WIDTH - Ball.RADIUS
    y0 = HEIGHT // 2
    vx0 = -VELOCITY
    vy0 = random.randint(-45,45)
    b0 = Ball(x0,y0, vx0, vy0, screen, wcolor, bgcolor, CONSTS)
    b0.show(wcolor)
   
    pygame.display.update()

    running = True
    clock = pygame.time.Clock()

    while running:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
              
        pygame.display.update()
        clock.tick(FPS)
            # Ball
            
        b0.update()
            

if __name__=="__main__":
    # call the main function
    main()