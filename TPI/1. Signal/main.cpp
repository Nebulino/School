#include <iostream>
#include <signal.h>
#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
#include <sys/wait.h>

using namespace std;

void handler(int);

int main() {
  int PID, i;
  PID = fork();
  if (PID > 0){
    signal(SIGCHLD, handler);
    for(i = 0; i < 10000000; i++){}
    printf("Padre terminato\n");
    exit(0);
  }
  else{
    for(i = 0; i < 100; i++){}
    printf("Figlio terminato\n");
    exit(1);
  }
}

void handler(int signum){
  int status;
  wait(&status);
  printf("Stato figlio: %d\n", status >> 8);
}
