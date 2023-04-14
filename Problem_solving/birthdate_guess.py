while True:
    guess = input("Enter a date between 1 to 31 using this format (date-December-2023): ")
    if guess == '21-December-2023':
        print("Correct Guess!")
        break
    else:
        print("Incorrect Guess.")
