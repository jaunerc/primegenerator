import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  primesUrl = '//localhost:8080/api/probable-prime?bitLength=';

  constructor(private http: HttpClient) {
  }

  getRandomPrime(bitLength) {
    var url = this.primesUrl;
    if (bitLength !== null) {
      url += bitLength;
    }
    return this.http.get(url);
  }

}
