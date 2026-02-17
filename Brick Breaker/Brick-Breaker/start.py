import pygame as pg
import random
import sys

''' Spiel Einstellungen '''
#Standard
pg.display.set_caption('Brick-Breaker')
pg.init()
width = 820
height = 600
left = 10
right = 10
bottom = 30
above = 50
screen = pg.display.set_mode((width,height))
FPS = 50
FPSCLOCK = pg.time.Clock()
    
#Ball
xposball = 400
yposball = 500
xbewegung = 4
ybewegung = 4
ballradius = 10

#Plattform
widthplatform = 200
heightplatform = 10
yPosplatform = 550
xPosplatform = (width / 2) - widthplatform / 2
direction = 0

#Punkte und Leben
points = 0
Leben = 3

#Bricks
brick_width = 80
brick_height = 20
brick_color = (155,48,255)

#https://www.tutorialspoint.com/brick-breaker-game-in-python-using-pygame Teil:1
#Bricks erstellen
bricks = []
for row in range(5):
    for col in range(10):
        xPosbrick = col * (brick_width + 10) + left #Spalte
        yPosbrick = row * (brick_height + 10) + above #Reihe
        bricks.append(pg.Rect(xPosbrick, yPosbrick, brick_width, brick_height))
    
''' Spiel Schleife '''
while(1):
    for event in pg.event.get():
        if event.type == pg.QUIT:
            pg.quit()
            sys.exit()
        if event.type == pg.KEYDOWN:
            if event.key == pg.K_RIGHT:
                direction = 1
            if event.key == pg.K_LEFT:
                direction = 2
    
    #Ball Kollision mit Brick erkennen
    for brick in bricks[:]:
        if brick.colliderect(pg.Rect(xposball - ballradius, yposball - ballradius, 2 * ballradius, 2 * ballradius)):
            bricks.remove(brick)
            ybewegung = -ybewegung
            points += 1
        
     # Ball Kollision mit Plattform
    if (yposball + ballradius > yPosplatform
        and xposball > xPosplatform
        and xposball < xPosplatform + widthplatform):
        ybewegung = -ybewegung
    
    #Ball Bewegung
    xposball += xbewegung
    yposball += ybewegung

    #Ball Grenzen
    if xposball > 810-left : #links
        xbewegung = xbewegung * -1

    if xposball < 30-right:     #rechts
        xbewegung = xbewegung * -1
    
    if yposball < 55 + ballradius : #oben
        ybewegung = ybewegung * -1
        
    if yposball > 600: #unten 
        ybewegung = ybewegung * -1
        Leben -= 1
    
    #brick bei Berührung
    for brick in bricks:
       if brick.collidepoint(xposball,yposball):
           bricks.remove(brick)
           ybewegung = ybewegung * -1
    
    #Bewegung Plattform 
    if direction == 1:
        xPosplatform += 10
        if xPosplatform >= (width - widthplatform - right):
            xPosplatform = width - widthplatform - right
    if direction == 2:
        xPosplatform -= 10
        if xPosplatform <= left:
            xPosplatform = left
            
    #Hintergrund
    screen.fill((100, 216, 230))    
            
    #Ränder
    pg.draw.rect(screen, (50,50,50), (0, 0, width, above), 0)  #oben
    pg.draw.rect(screen, (50,50,50), (0, 0, left , height), 0)  #links
    pg.draw.rect(screen, (50,50,50), (width - right, 0, right, height), 0)  #rechts  

    #brick zeichnen
    for brick in bricks:
        pg.draw.rect(screen, brick_color, brick)
    
    #Ballzeichnen
    pg.draw.circle(screen, (255, 255, 255), (xposball, yposball), ballradius)
    
    #Pflatform zeichnen
    pg.draw.rect(screen, (50,190,190), (xPosplatform, yPosplatform, widthplatform, heightplatform))
    
    #Leben
    if (yposball <= heightplatform+50):#Leben soll abgezogen werden wenn ball unteren Rand berührt
        Leben = Leben - 1
        
    #Schriften
    font = pg.font.SysFont(None, 25)
    status = pg.font.SysFont('Open Sans', 100)
    
    #SpielEnde
    if (Leben <= 0):
        xposball = 400
        yposball = 500
        xPosplatform = (width / 2) - widthplatform / 2
        yPosplatform = 550
        screen.blit(status.render('Game Over', True, (0,0,0)), (225, 300))
     
    #Spiel Gewonnen
    if(points == 10):
      screen.blit(status.render('Gewonnen', True, (0,0,0)), (225, 300))
      xposball = 400
      yposball = 500
      xPosplatform = (width / 2) - widthplatform / 2
      yPosplatform = 550
        
    #Punkte und Leben
    screen.blit(font.render('Brick-Breaker', True, (0,200,250)), (355, 7))
    screen.blit(font.render('Punkte: ' + str(points), True, (255,250,250)), (20, 30))
    screen.blit(font.render('Leben: ' + str(Leben), True, (255,250,250)), (710, 30))

    # Update von Fenster
    pg.display.flip()
    FPSCLOCK.tick(FPS)
    pg.display.update()
    
        









