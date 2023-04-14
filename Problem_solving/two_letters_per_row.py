# word = "Hello"
# for i in range(0, len(word), 2):
#     print(word[i:i+2])

def two_letters_per_line(word):
    # for i in range(0, len(word)):
    #     print(word[i:i+3])
    for i in word:
        print(i.join(i+1),)
        print()


if __name__ == '__main__':
    word = 'VENTURES'
    two_letters_per_line(word)
