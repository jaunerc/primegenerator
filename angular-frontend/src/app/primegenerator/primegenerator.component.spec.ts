import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {PrimegeneratorComponent} from './primegenerator.component';

describe('PrimegeneratorComponent', () => {
  let component: PrimegeneratorComponent;
  let fixture: ComponentFixture<PrimegeneratorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [PrimegeneratorComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PrimegeneratorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
