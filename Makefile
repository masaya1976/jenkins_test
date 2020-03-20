CC := gcc
CFLAGS := -g -Wall -Wextra

main:main.o
	$(CC) -o main.out main.o

main.o:main.cpp
	$(CC) -c main.cpp

clean:
	rm main.out
	rm *.o
