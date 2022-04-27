length = float(input('Enter the length of a Rectangle: '))
width = float(input('Enter the width of a Rectangle: '))

Area = length * width
print("Rectangle part of the room is: %.2f" %Area )

trapbasetop = float(input('Enter the top length of trapizoid: '))
trapbasebottom = float(input('Enter the bottom length of trapizoid: '))
trapbaseheight = float(input('Enter the height of trapizoid: '))


TrapArea = ((trapbasetop + trapbasebottom) / 2) * trapbaseheight
print("Area of a trap is: %.2f" %TrapArea)

sum = TrapArea + Area
print("Area of room is: %.2f" %sum)

