import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateNidComponent } from './create-nid.component';

describe('CreateNidComponent', () => {
  let component: CreateNidComponent;
  let fixture: ComponentFixture<CreateNidComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateNidComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateNidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
