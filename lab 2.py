import pygame

def main():
    pygame.init()

    WIDTH = 800
    HEIGHT = 480
    screen = pygame.display.set_mode((WIDTH,HEIGHT))
    pygame.display.update()

    wcolor = pygame.Color("white")
    BORDER = 20
    pygame.draw.rect(screen, wcolor, pygame.Rect((0,0),(WIDTH, BORDER)))
    pygame.draw.rect(screen, wcolor, pygame.Rect((0,0),(BORDER, HEIGHT)))
    pygame.draw.rect(screen, wcolor, pygame.Rect((0,HEIGHT-BORDER),(WIDTH, BORDER)))
    pygame.draw.rect(screen, wcolor, pygame.Rect((0,HEIGHT),(HEIGHT, BORDER)))

    pygame.display.update()

    running = True

    while running:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False

if __name__=="__main__":
    # call the main function
    main()