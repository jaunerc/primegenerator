import {Component, Injectable, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {ApiService} from "../api.service";

@Component({
  selector: 'app-primegenerator',
  templateUrl: './primegenerator.component.html',
  styleUrls: ['./primegenerator.component.css']
})

@Injectable()
export class PrimegeneratorComponent implements OnInit {

  primeForm = new FormGroup({
    bitLength: new FormControl(),
    primeNumber: new FormControl()
  });

  constructor(private service: ApiService) {
  }

  ngOnInit(): void {
  }

  onSubmit() {
    this.service.getRandomPrime(this.primeForm.value.bitLength)
      .subscribe(data => {
        this.primeForm.patchValue({primeNumber: data});
      });
  }
}

